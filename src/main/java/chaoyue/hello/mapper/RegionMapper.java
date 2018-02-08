package chaoyue.hello.mapper;

import chaoyue.hello.dao.Region;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionMapper {
  int deleteByPrimaryKey(Integer id);

  int insert(Region record);

  int insertSelective(Region record);

  Region selectByPrimaryKey(Integer id);

  List<Region> selectByModelLike(Region record);

  List<Region> selectByModel(Region record);

  int updateByPrimaryKeySelective(Region record);

  int updateByPrimaryKey(Region record);
}
